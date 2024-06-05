// @ts-check
//
// The line above enables type checking for this file. Various IDEs interpret
// the @ts-check directive. It will give you helpful autocompletion when
// implementing this exercise.

/**
 * Removes duplicate tracks from a playlist.
 *
 * @param {string[]} playlist
 * @returns {string[]} new playlist with unique entries
 */
export function removeDuplicates(playlist) {
  // set을 사용하여 중복 제거
  const uniquePlaylist = [...new Set(playlist)];
  return uniquePlaylist;
}

/**
 * Checks whether a playlist includes a track.
 *
 * @param {string[]} playlist
 * @param {string} track
 * @returns {boolean} whether the track is in the playlist
 */
export function hasTrack(playlist, track) {
  // includes() 메서드를 사용하여 track이 playlist에 있는지 확인
  return playlist.includes(track);
}

/**
 * Adds a track to a playlist.
 *
 * @param {string[]} playlist
 * @param {string} track
 * @returns {string[]} new playlist
 */
export function addTrack(playlist, track) {
  // 플레이리스트에 트랙이 존재하는지 확인
  if (!playlist.includes(track)) { 
    // 플레이리스트에 트랙 추가
    playlist.push(track);
  }
  return playlist;
}

/**
 * Deletes a track from a playlist.
 *
 * @param {string[]} playlist
 * @param {string} track
 * @returns {string[]} new playlist
 */
export function deleteTrack(playlist, track) {
  // 트랙이 있는 인덱스 탐색
  const index = playlist.indexOf(track);
  if (index !== -1) {
    // splice() 메서드를 사용하여 트랙 삭제
    playlist.splice(index, 1);
  }
  return playlist;
}

/**
 * Lists the unique artists in a playlist.
 *
 * @param {string[]} playlist
 * @returns {string[]} list of artists
 */
export function listArtists(playlist) {
  // 고유한 아티스트를 추츌허가 위해 map()과 Set 사용
  const artists = playlist.map(track => track.split(' - ')[1]);
  return [...new Set(artists)];
}
